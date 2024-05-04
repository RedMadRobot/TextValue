import com.redmadrobot.build.dsl.*

plugins {
    id("com.redmadrobot.publish-config")
    id("com.redmadrobot.publish")
}

redmadrobot {
    publishing {
        signArtifacts = !isRunningOnCi
        pom {
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
}

publishing {
    repositories {
        if (isRunningOnCi) githubPackages("RedMadRobot/TextValue")
        if (isReleaseVersion && credentialsExist("ossrh")) ossrh()
    }
}
