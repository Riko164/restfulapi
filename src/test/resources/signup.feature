Feature: Pendaftaran User

   Disediakan sebuah fungsi API yang memungkinkan seorang user untuk membuat akun baru di sistem Note ini.

   Scenario: User Signup
   Given Seorang user dengan nama lengkap "shikimime3" 
   And username "shikimime3"
   And password "1234"
   When Didaftarkan ke sistem
   Then Sistem mengembalikan berhasil