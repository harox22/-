//泛型
public class GenericsDemo1{
	public static void main(String[] args){
		//创建集合的对象
		ArrayList<String> list=new ArrayList<>();

		//添加数据
		list.add(123);
		list.add("abc");
		list.add(new Student(name:"zhangsan",age:12));

		//遍历集合获取里面的每一个元素
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
		
	}
}