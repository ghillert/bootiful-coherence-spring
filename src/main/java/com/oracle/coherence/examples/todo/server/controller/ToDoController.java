package com.oracle.coherence.examples.todo.server.controller;

import com.oracle.coherence.examples.todo.server.model.Task;
import com.oracle.coherence.examples.todo.server.service.TaskService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * REST API for To Do list management.
 *
 * @author Gunnar Hillert
 */
@RestController
@RequestMapping(path="/api/tasks",
				consumes = MediaType.APPLICATION_JSON_VALUE,
				produces = MediaType.APPLICATION_JSON_VALUE)
public class ToDoController {
	private TaskService taskService;

	public ToDoController(TaskService taskService) {
		this.taskService = taskService;
	}

	@GetMapping
	public Collection<Task> getTasks(@RequestParam(defaultValue = "false") boolean completed) {
		return taskService.findAll(completed);
	}

	@PostMapping
	public void createTask(@RequestBody Task task) {
		taskService.save(new Task(task.getDescription()));
	}

	@DeleteMapping("/{id}")
	public void deleteTask(@PathVariable String id) {
		taskService.removeById(id);
	}

	@DeleteMapping
	public void deleteCompletedTasks() {
		taskService.deleteCompletedTasks();
	}

	@PutMapping("/{id}")
	public Task updateTask(@PathVariable String id, @RequestBody Task task) {
		return taskService.update(id, task);
	}
}