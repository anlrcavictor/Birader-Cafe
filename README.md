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
  </br></br>
  *Web sitesinin görselinde Bootstrap kullanılmıştır.Hazır bir bootstrap template i tüm siteye giydirilmişitr.Bu giydirme header ve      footerın `<jsp:include/>` jsp tagi ile gerçekleştirilmiştir.Hem sitenin ön yüzü hem de admin tarafınının header ve footer ları bu 
  şekilde jsp sayfalarına import edilmiştir.Boottstrap kullanıldığı için proje responsive özelliği göstermektedir.Tüm görsel elemanlar
  projenin içinde ve onlara ulaşım ise proje içindeki yolları ile gerçekleştirilmektedir.Fotoların yolları(Path)ise veri tabanında
  tutulmaktadır.*
  </br></br>
  ![Responsive](https://github.com/anlrcavictor/ImagesRepo-for-Readme/blob/master/BiraderCafe/Responsive.png?raw=true) maveb 
  </br></br>
  *Projede maven kullanılmamıştır.gerekli jar lar WEB-INF/lib altındadır.Tüm jsp sayfaları WebContent altındadır.*
  
  ## Project Structure
  
  ![Structure](https://github.com/anlrcavictor/ImagesRepo-for-Readme/blob/master/BiraderCafe/Structure.png?raw=true)
  
  ## Projeden Görüntüler
  
  ![HomePage](https://github.com/anlrcavictor/ImagesRepo-for-Readme/blob/master/BiraderCafe/HomePage.png?raw=true)
  ![AdminPage](https://github.com/anlrcavictor/ImagesRepo-for-Readme/blob/master/BiraderCafe/NewsAdmin.png?raw=true)
  
