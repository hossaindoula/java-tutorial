package info.doula.concurrency;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 *
 * skype: mohammedhossaindoularonnie
 *
 * http://hossaindoula.com
 *
 * https://github.com/hossaindoula
 */
public class TaskResult {
	private int taskId;
	private int result;

	public TaskResult(int taskId, int result) {
		this.taskId = taskId;
		this.result = result;
	}

	public int getTaskId() {
		return taskId;
	}

	public int getResult() {
		return result;
	}

	public String toString() {
		return "Task Name: Task #" + taskId + ", Task Result:" + result + " seconds";
	}
}
