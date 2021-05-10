repositories {
    mavenCentral()
}
dependencies {
    implementation(project(":common"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    runtimeOnly("org.postgresql:postgresql")
}

tasks.bootJar{
    enabled = false
}

tasks.jar{
    enabled = true
}