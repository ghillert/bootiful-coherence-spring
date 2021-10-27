package com.oracle.coherence.examples.todo.server.repository;

import com.oracle.coherence.examples.todo.server.model.Task;
import com.oracle.coherence.spring.data.config.CoherenceMap;
import com.oracle.coherence.spring.data.repository.CoherenceRepository;

/**
 * A {@code Coherence}-based repository for working with {@link Task tasks}. Uses
 * Spring Data support which is provided by Coherence Spring.
 *
 * @author Gunnar Hillert
 */
@CoherenceMap("tasks")
public interface SpringDataTaskRepository extends CoherenceRepository<Task, String> {
}
