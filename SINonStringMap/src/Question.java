import java.util.Map;

public class Question<Answer,Location> {
	
	private int id;
	private String name;
	private Map<Answer,Location> answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Answer, Location> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Answer, Location> answers) {
		this.answers = answers;
	}
	
	public void display() {
		System.out.println(id+" "+name);
		System.out.println("Answers are=> ");
		
		for(Map.Entry<Answer,Location> obj:answers.entrySet()) {
			System.out.println(obj.getKey()+" "+obj.getValue());
			
		}
		
	}
	

}
