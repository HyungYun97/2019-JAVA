package �������̽�1;

public class test {
		void MoviePlayer() {
	Controllerable Videoplayer = new Controllerable() {
			
		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("���� ����");
		}

		@Override
		public void stop() {
			// TODO Auto-generated method stub
			System.out.println("���� ����");
		}
		
	};Videoplayer.play();
	Videoplayer.stop();
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle();
		a.print();
		a.move(10, 10);
		a.draw();
		Rectangle b = new Rectangle();
		b.move(15, 15);
		b.print();
		b.draw();
		Triangle c = new Triangle();
		c.move(20, 20);
		c.print();
		c.draw();
		test d = new test();
		d.MoviePlayer();
	}
	

}
