import java.util.Scanner;

class Day{
    private String work;        
    public void set(String work) { this.work=work;}
    public String get() {return work;}
    public void show() {
        if(work==null)
            System.out.println("없습니다.");
        else
            System.out.println(work+"입니다. ");
    }
}

class MonthSchedule{
	private int i;
	Day [] day;
	int numday;
	boolean flag = true;
	
	Scanner scanner = new Scanner(System.in);
	
	public MonthSchedule(int i){
		numday = i;
		day = new Day[numday];
		for(int j = 0; j < day.length; j++)
			day[j] = new Day();
	}
	
	public void input() {
        System.out.print("날짜(1~30)?");
        int i=scanner.nextInt();
        System.out.print("할일(빈칸없이입력)?");
        String work=scanner.next();
        day[i-1].set(work);    
    }                                
    
    public void view() {
        System.out.print("날짜(1~30)?");
        int i=scanner.nextInt();
        System.out.print(i+"일의 할 일은 ");
        day[i-1].show();
    }
    
    public void finish() {
        System.out.println("프로그램을 종료합니다.");
        flag = false;
    }
    
    public void run() {
        int menu;
        System.out.println("이번달 스케쥴 관리 프로그램.");
        while(flag) {
            System.out.print("할일(입력:1, 보기:2, 끝내기3:) >>");
            menu = scanner.nextInt();
            switch(menu) {
            case 1:
                input();
                break;
            case 2:
                view();
                break;
            case 3:
                finish();
                break;
            default:
                System.out.println("제대로 입력하세요!");
            }
            System.out.println();
        }
    }
}

public class Challenge7 {

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}
