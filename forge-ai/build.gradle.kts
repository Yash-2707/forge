/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("forge.java-conventions")
}

dependencies {
    api(project(":forge-core"))
    api(project(":forge-game"))
    api(libs.org.apache.commons.commons.math3)
}

description = "Forge AI"
