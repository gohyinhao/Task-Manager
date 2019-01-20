import java.util.ArrayList;
import java.util.List;

public class Task {
	private static List<String> tasks = new ArrayList<>();

	public void add(String task) {
		tasks.add(task);
		System.out.println("Tasks in the list: " + tasks.size());
	}

	public boolean isEmpty() {
		return tasks.isEmpty();
	}

	public int size() {
		return tasks.size();
	}

	public String get(int index) {
		return tasks.get(index);
	}

	public void print() {
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println("[" + (i+1) + "]" + tasks.get(i));
		}
	}
}
