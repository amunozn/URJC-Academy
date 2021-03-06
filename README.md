# URJC-Academy
# Descripción de la web
La aplicación pretende agilizar las labores de administración, admisión, gestión y planificación de la actividad de una academia universitaria.
-  Parte Pública: Consistirá en una capa muy sencilla en donde los usuarios no registrados puedan obtener información de los cursos o asignaturas que se realizan en la academia. Si están interesados, podrán darse de alta como usuarios "Alumno", a través de un sencillo formulario de inscripción.
-  Parte Privada: 
    -   Alumno: El alumno podrá inscribirse en una o varias asignaturas, solicitar tutorias de refuerzo a los profesores, descargar apuntes de las clases, etc.
    -   Profesor: El profesor podrá validar solicitudes para tutorías, cambiar la fecha de una clase, subir apuntes, etc.
    -   Administrador: Se encargará de gestionar la página, dando de alta o baja a usuarios. Se encargará de habilitar enlaces de recuperación de contraseña, a aquellos usuarios registrados que no recuerden su contraseña de acceso, etc.
    
# Entidades
-   Alumno: Usuario final básico. Entre sus funciones estarán la de inscribirse a una o varias asignaturas, valorar la labor de los profesores, así como solicitar tutoriás a los profesores a través de la aplicación.
-   Profesor: Usuario final con ciertos privilegios, que le permitirán cerrar la fecha de las tutorías con los alumnos, cambiar la fecha de una clase, subir apuntes a la apliacación. Cada profesor tendrá una columna con la valoración media emitida por todos los alumnos a los que haya dado clase.
-   Administrador: Usuario con privilegios de root.
-   Titulación: Repositorio en donde los alumnos podrán consultar, e inscribirse a todas las asignaturas de su titulación.
-   Asignatura/Clase: Asignatura x de una titulación y. La clase la dara un profesor para un grupo de alumnos, en una fecha establecida.
-   Tutoria:  Clase personalizada, que previamente será solicitada por un alumno, y validada por un profesor.
-   Apuntes. 
# Diagrama de Clases
Este es el diagrama de clases de nuestra aplicación, siempre sujeto a cambios si fuese necesario.

![](imagenes/Diagrama_de_clases_Fase2.png "Diagrama_de_clases_Fase2")

# Diagrama de transicion pantallas.
La transicion entre pantallas es sencilla ya que este es el esquema base de nuestra aplicación. A medida que añadamos funcionalidades el número de pantallas puede aumentar.

![](imagenes/Diagrama_de_pantallas_Fase2.png "Diagrama_de_pantallas_Fase2")

# Diagrama Entidad-Relación
A continuación se puede observar el diagrama Entidad-Relación de nuestro modelo de datos.

![](imagenes/E_R.jpg "E_R")

# Servicio Interno
-   La apliación ha de ser capaz de mantener informados a los usuarios vía correo electrónico, o vía whatsapp (si podemos conseguir implementar este último), de cualquiera de los cambios que se produzcan en la página web, referidos al planning de la propia academía.

# Integrantes

-   Andrés Casado García: a.casadoga@alumnos.urjc.es
-   Daniel Fuerte Álvarez: d.fuerte@alumnos.urjc.es
-   Alvaro Muñoz Negreles: a.munozn@alumnos.urjc.es


    
