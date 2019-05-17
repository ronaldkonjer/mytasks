package info.sliceoflife.mytasks.service;

import info.sliceoflife.mytasks.domain.Task;

public interface TaskService {

	Iterable<Task> list();

	Task save(Task task);
}
