package Day04_practice.Sycnhronzation;
//Multithreading programlamada birden fazla Thread aynı anda ortak bir kaynağa erişmeye çalışırsa
//istenmeyen sonuçlar oluşacaktır. Bu durumda threadlere sırayla erişim vermek gerekecektir.
// Bir thread kaynağı kullanıyorken diğerleri onu beklemelidirler. Bu "synchronized" keywordü ile sağlanır.

/*
Task: Bir randevu oluşturma uygulaması tasarlayınız.(AppoinmentCenter)
      Uygulama herbir talep için bir gün sonrasına tarih
      vermelidir.
*/
public class AppoinmentApp {
    public static void main(String[] args) {
        AppointmentCenter appointmentCenter=new AppointmentCenter();
        String[] users= {"Tolstoy", "VictorHugo","Balzac","Dosteveski"," JOhnsdkaskd"};
        for(String user: users){



        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName(user);
                String name=Thread.currentThread().getName();
                appointmentCenter.getAppointmentDate();
                System.out.format("\nSayın %-16s, Randevu tarihiniz: %10s ",name ,appointmentCenter.getAppointmentDate());
            }
        });
            thread1.start();
        }

    }

}
