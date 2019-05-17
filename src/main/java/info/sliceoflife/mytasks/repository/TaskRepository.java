package info.sliceoflife.mytasks.repository;

import info.sliceoflife.mytasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {



}
