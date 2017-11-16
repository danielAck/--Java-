import java.util.Scanner;


public class Test {
	
	public static LinkList createNode(int data){
		LinkList p = new LinkList();
		p.data = data;
		p.next = null;
		return p;
	}
	
	public static LinkList Insert(LinkList list, int data){
		LinkList p = createNode(data);
		LinkList temp = list;
		
		if(temp == null){
			return p;
		}else{
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = p;
			return list;
		}
	}
	
	
	public static void print(LinkList list){
		LinkList temp = list;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		
		int N,data;
		LinkList list = null;
		
		N = new Scanner(System.in).nextInt();
		for(int i =0; i < N; i++){
			data = new Scanner(System.in).nextInt();
			list = Insert(list,data);
		}
		
		print(list);
		
	}
}
