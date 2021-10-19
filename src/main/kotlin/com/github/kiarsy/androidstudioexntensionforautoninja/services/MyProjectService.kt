package com.github.kiarsy.androidstudioexntensionforautoninja.services

import com.intellij.openapi.project.Project
import com.github.kiarsy.androidstudioexntensionforautoninja.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
