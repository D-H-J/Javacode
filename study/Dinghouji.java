class Tank{
	private double speed;
	private int bullet;
	public Tank( double speed,int bullet) {
	    this.speed = speed; 
	    this.bullet = bullet;
	  }
	void speedup(double s){
		if(speed + s <= 200)
		{
			speed += s;
			System.out.println("̹��Ŀǰ���ٶ�Ϊ��" + speed);
		}
		else {
			speed = 200;
			System.out.println("̹��Ŀǰ���ٶ�Ϊ200");
		}
	}
	void speeddown(double s){
		if(speed - s >= 0)
		{
			speed -= s;
			System.out.println("̹��Ŀǰ���ٶ�Ϊ��"+ speed);
		}
		else {
			speed = 0;
			System.out.println("̹��Ŀǰ���ٶ�������0");
		}
	}
	void frie(String str,int n){
		System.out.println(str + "���ڿ���");
			for(int i = 0; i < n;i ++){
				if (bullet > 0){
					System.out.println("���һ���ڵ�");
					bullet = bullet - 1;
				}
				else {
					System.out.println("û���ӵ�����װ�ĵ�");
					break;
				}
			}
	}
	void setBulletAmount(int p){
		bullet = p;
		System.out.println("��ǰ�ڵ�������Ϊ:" + bullet);
	}
	int  getbullet(){
		return bullet;
	}
public class  Dinghouji{
	public static void main (String[] args){
		Tank t1 = new Tank(100,10);
		Tank t2 = new  Tank(100,10);
 		t1.speedup(30);
 		t2.speedup(20);
 		t1.setBulletAmount(30);
 		t2.setBulletAmount(30);
 		t1.frie("t1",5);
 		t2.frie("t2",38);

 	}

}