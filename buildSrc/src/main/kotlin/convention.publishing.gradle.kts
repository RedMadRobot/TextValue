import com.redmadrobot.build.dsl.*

plugins {
    id("com.vanniktech.maven.publish")
}

mavenPublishing {
    publishToMavenCentral(automaticRelease = true)
    signAllPublications()

    pom {
        name.convention(project.name)
        description.convention(project.description)

        setGitHubProject("RedMadRobot/TextValue")

        licenses {
            mit()
        }

        developers {
            developer(id = "osipxd", name = "Osip Fatkullin", email = "o.fatkullin@redmadrobot.com")
            developer(id = "sonulen", name = "Andrey Tolmachev", email = "sonulen@gmail.com")
        }
    }
}

publishing {
    repositories {
        if (isRunningOnCi) githubPackages("RedMadRobot/TextValue")
    }
}
