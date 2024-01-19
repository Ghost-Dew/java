package Housing_rental_system;

public class HouseView {
    public void mainMenu(){ //主菜单界面
        System.out.println("----------房屋出租系统----------");
        System.out.println("        1、新增房源             ");
        System.out.println("        2、查找房屋             ");
        System.out.println("        3、删除房屋             ");
        System.out.println("        4、修改房屋信息          ");
        System.out.println("        5、房屋列表             ");
        System.out.println("        6、退    出             ");
    }
    public void listHouse(){
        System.out.println("----------房屋列表----------");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态(未出租/已出租)");
        //for循环遍历
    }
    public void addHouse(){
        System.out.println("----------新增房源----------");
    }
    public void delHouse(){
        System.out.println("----------删除房屋----------");
    }
    public void findHouse(){
        System.out.println("----------查找房屋----------");
    }
    public void updateHouse(){
        System.out.println("----------修改房屋信息----------");
    }
}
