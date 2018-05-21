# Birader-Cafe
JSP&amp;Servlet ve JDBC kullanılarak yapılmış dinamik bir Web Projesi

## Proje Açıklaması
*Java teknolojileri kullanarak yaptığım ilk web projesidir.Muhakkak hatalarım olabilir.Dinamik bir web sitesinin olmazsa olmazları olan
Authentication,Authorization,Back-and Validation işlemleri yapılmıştır.Tüm ihtiyaçlar Java EE dünyasının dışına çıkılmadan yapılmıştır.
Servletlerle Controller,Filter ile Authorization gerçekleştirilmiştir.DAO katmanında JDBC kullanılıp herhangi bir ORM çözümü 
kullanılmamıştır.*
</br></br>
  *Controller da tek servlet tek tablonun işlemlerini yapmıştır.MVC patterni uygulanmıştır.Servis Katmanı yoktur ve tüm Business Logic
Controller larda gerçekleşmiştir.*[Örnek HaberController](https://github.com/anlrcavictor/Birader-Cafe/blob/master/BiraderCafe01/src/AdminController/HaberController.java)
</br>
  *Login işlemi ve Authorization eşleşmesi session alanı kullanılarak yapılmıştır.Eğer Login olduysa Session attribute oluştur.Çıkış
  yapılırsa Session attribute ü uçur mantığı ile gerçekleştirilmiştir.Kullanıcının login olup olmadığı ise link ile admin tarafı 
  Controller larına ulaştığında araya girerek Session attribute unu kontrol ile gerçekleştirilmiştir.* 
  [Filter](https://github.com/anlrcavictor/Birader-Cafe/blob/master/BiraderCafe01/src/Filter/AdminFilter.java)
 [LoginController](https://github.com/anlrcavictor/Birader-Cafe/blob/master/BiraderCafe01/src/Controller/LoginController.java)
 </br></br>
  ![Login](https://github.com/anlrcavictor/ImagesRepo-for-Readme/blob/master/BiraderCafe/Login.png?raw=true)
  </br></br>
  *Validation işlemi web sitesinin bize ulaşın bölümünde yapılmıştır.Çünkü normal kullanıcının veri girişi sadece burdan yapılabilmektedir.
  Kullanıcının işletmeye görüş ve önerilerini bu sayfadan yapmaktadır.Burada Html5 in özellikleri kullanılarak hafif bir Front-End 
  Validasyon,Verinin kaydedilmesi sırarsında ise Back-And Validasyon yapılmıştır.Bu Validasyon için basit xss-attack tehlikeleri için 
  '<script>' etiketini yakalamak ve bazı uygunsuz girişlerimn veri kaydını engelleme yapılmıştır.*
  [İnceleyebilirisniz](https://github.com/anlrcavictor/Birader-Cafe/blob/master/BiraderCafe01/src/Validator/Validator.java)
  *Burada if else mantğıyla validasyon yapılmış olup Spring Security gibi bir hazır yapı kullanılmamıştır.*
  </br></br>
  ![Validation](https://github.com/anlrcavictor/ImagesRepo-for-Readme/blob/master/BiraderCafe/BizeUlasin.png?raw=true)
  </br></br>
  *Tüm Mesajlar admin tarafında ve yeni eklenenler en başta olacak,okunmamışsa okunmadı ibaresini gösterecek şekilde kullanıcı dostu 
  olacak şekilde dizayn edilmiştir.*
  </br></br>
  ![Mesajlar](https://github.com/anlrcavictor/ImagesRepo-for-Readme/blob/master/BiraderCafe/MesagesAdmin.png?raw=true)
  
  
