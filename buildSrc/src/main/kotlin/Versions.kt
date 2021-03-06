import org.gradle.api.JavaVersion

object Versions {

    val jvmTarget = JavaVersion.VERSION_1_8

    // Dependencies
    val apiGuardian = "1.1.0"
    val junit4 = "4.12"
    val ota4j = "1.2.0"
    val picocli = "4.0.4"
    val univocity = "2.8.3"

    // Test Dependencies
    val archunit = "0.11.0"
    val assertJ = "3.13.2"
    val bartholdy = "0.2.3"
    val classgraph = "4.8.48"
    val commonsIo = "2.6"
    val groovy = "3.0.0-beta-3"
    val log4j = "2.12.1"
    val mockito = "3.1.0"
    val slf4j = "1.7.28"

    // Asciidoctor
    val asciidoctorDiagram = "1.5.9"
    val asciidoctorJ = "1.5.7"
    val asciidoctorPdf = "1.5.0-alpha.17"
    val jruby = "9.1.17.0"

    // Tools
    val checkstyle = "8.25"
    val jacoco = "0.8.5"
    val jmh = "1.21"
    val ktlint = "0.35.0"
    val surefire = "2.22.2"

}
