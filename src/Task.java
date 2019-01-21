public class Task {
	private String description;
	private String deadline;
	private String completion;

	public Task(String description) {
		this.description = description;
		this.completion = "No";
		this.deadline = null;
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

	public boolean descriptionIsEmpty() {
		if (description == null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean deadlineIsEmpty() {
		if (deadline == null) {
			return true;
		} else {
			return false;
		}
	}

}