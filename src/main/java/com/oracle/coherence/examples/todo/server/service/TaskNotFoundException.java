package com.oracle.coherence.examples.todo.server.service;

/**
 * An exception indicating that a {@link com.oracle.coherence.examples.todo.server.model.Task} was not found.
 * @author Gunnar Hillert
 */
public class TaskNotFoundException extends RuntimeException {
	/**
	 * Create the exception.
	 * @param message reason for the exception.
	 */
	public TaskNotFoundException(String message) {
		super(message);
	}
}
