autor: Farid Ureche

<h1>Prueba técnica Solati</h1>

Se presenta servicio REST con dos metodos un POST y un GET, que recibe una cadena de un genoma y definine si se trata de un humano o un extraterreste.

<h3>Arquitecturas utilizada</h3>

<ol>
  <li>Arquitectura de microservicios</li>
  <li> Arquitectura por capas</li>
  <li> Arquitectura cliente/servidor  </li>
 </ol>
 
<h3> Patrones de diseño </h3>
<ol>
    <li> MVC</li>
    <li> Facade</li>
   <li> Patron repository (DAO)</li>
 </ol>
 
<h3> Paradigmas de programación </h3>
 <ol>
  <li> Programación orientada a aspectos</li>
  <li>Programación orientada a objetos</li>
  </ol>
 
 <h3>Herramientas Adicionales</h3>
  <ol>
  <li>Api Swagger </li>
  <li>Base de datos MongoDb</li>
  <li>Docker - contenerización de la aplicación</li>
  <li>Kubernetes - Adminitración de contenedores</li>
  </ol>
 
 Pasos para probar:
 <ol>
 <li>aceder a la url: http://a158113b9c9724b1dbbca853cf70244b-492654212.us-east-1.elb.amazonaws.com:9191/swagger-ui.html</li>
 <li>Escoger el metodo POST del controlador Mutant Controller</li>
 <li>Escoger la opción TRY of out</li>
 <li>cambiar el json de muestra por :  Prueba Humano: { "dna":["TTGTCC","TTGTTC","TTATGT","TGACGG","CCTCCC","TCTCTG"] }      o por  Prueba Mutante: { "dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"] }</li>
 <li>Dar click en EXCECUTE</li> 
 </ol>
 
  <li>Escoger el metodo GET del controlador Stat Controller</li>
 <li>Escoger la opción TRY of out</li> 
 <li>Dar click en EXCECUTE</li> 
 </ol>
 
