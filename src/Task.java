public class Task {
	private String description;
	private String deadline;
	private String completion;

	public Task(String description) {
		this.description = description;
		this.completion = "No";
		this.deadline = "NIL";
	}

	public Task(String description, String deadline) {
		this.description = description;
		this.deadline = deadline;
		this.completion = "No";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getCompletion() {
		return completion;
	}

	public void setCompletion(String completion) {
		this.completion = completion;
	}
}