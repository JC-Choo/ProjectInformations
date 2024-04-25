// Top-level build file where you can add configuration options common to all sub-projects/modules.
//buildscript {
//    repositories {
//        google()
//        mavenCentral()
//    }
//    dependencies {
//        classpath "com.android.tools.build:gradle:8.2.0"
//        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0"
//
//        // NOTE: Do not place your application dependencies here; they belong
//        // in the individual module build.gradle files
//
//        classpath "org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:2.7.1"
//    }
//}

plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
//    id("org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:") version "2.7.1" apply false
}

//task clean(type: Delete) {
//    delete rootProject.buildDir
//}
//
//apply plugin: "org.sonarqube"
//sonarqube {
//    properties {
//        property "sonar.host.url", "http://localhost:9000/"
//        property "sonar.login", "admin"        // 로그인 id 또는 인증토큰
//        property "sonar.password", "qlalfqjsgh1!"    // 인증토큰 사용시는 공백으로
//        property "sonar.projectKey", "projectKey"
//        property "sonar.projectName", "Infos"
//        property "sonar.projectVersion", "1.0.0"
//        property "sonar.sourceEncoding", "UTF-8"
//        property "sonar.sources", "src/main/java"
//        property "sonar.profile", "Sonar way"
//        // property "sonar.coverage.jacoco.xmlReportPaths", "build/reports/coverageReport/coverageReport.xml"    // Test Coverage Report 생성한 경우 사용
//    }
//}