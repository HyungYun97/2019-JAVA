package 상속연습문제;

public class animal {
	private String name;
	private String age;
	private String gender;
	private String sleep;
	private String eat;
	private String sound;
	
	public animal(String name, String age, String gender, String sleep, String eat, String sound) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.sleep = sleep;
		this.eat = eat;
		this.sound = sound;
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSleep() {
		return sleep;
	}

	public void setSleep(String sleep) {
		this.sleep = sleep;
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	public void attribute() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+gender);
	}
	public void Act() {
		System.out.println("잠자는행동"+sleep);
		System.out.println("먹는행동"+eat);
		System.out.println("짖는소리 : "+sound);
	}
}
