package USBTest;

public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        com.transferData(flash);

        //2.创建了接口的非匿名实现类的匿名对象
        com.transferData(new Printer());
        //3.创建接口的匿名实现类的非匿名对象
        USB phone = new USB(){

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("phone is working");
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("phone is stopping");
			}

        };
        com.transferData(phone);

        //4.创建接口的匿名实现类的匿名对象
        com.transferData(new USB(){

            @Override
            public void start() {
                // TODO Auto-generated method stub
                System.out.println("mp3 is working");
            }

            @Override
            public void stop() {
                // TODO Auto-generated method stub
                System.out.println("mp3 is stopping");
            }
            
        });
    }
}

class Computer{
    public void transferData(USB usb){
        usb.start();
        System.out.println("working now");
        usb.stop();
    }
}

interface USB{
    void start();
    void stop();
}

class Flash implements USB{

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("USB is working");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("USB is stopping");

    }   
}

class Printer implements USB{

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Printer is working");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Printer is stopping");
    }
    
}
