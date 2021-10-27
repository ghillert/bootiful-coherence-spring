package com.oracle.coherence.examples.todo.server.service;

import java.util.Collection;

import com.oracle.coherence.examples.todo.server.model.Task;

/**
 * Task service that delegates to the underlying
 * {@link com.oracle.coherence.examples.todo.server.repository.SpringDataTaskRepository}.
 * @author Gunnar Hillert
 */
public interface TaskService {
	Collection<Task> findAll(boolean completed);
	Task find(String id);
	void save(Task task);
	void removeById(String id);
	void deleteCompletedTasks();
	Collection<Task> deleteCompletedTasksAndReturnRemainingTasks();
	Task update(String id, Task task);
}
