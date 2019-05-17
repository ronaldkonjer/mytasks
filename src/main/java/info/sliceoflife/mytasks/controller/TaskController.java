package info.sliceoflife.mytasks.controller;

import info.sliceoflife.mytasks.domain.Task;
import info.sliceoflife.mytasks.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	private final TaskService taskService;

	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}

	@GetMapping(value = {"", "/"})
	public Iterable<Task> listTasks() {
		return taskService.list();
	}

	@PostMapping("/save")
	public Task saveTask(@RequestBody Task task) {
		return taskService.save(task);
	}

}
