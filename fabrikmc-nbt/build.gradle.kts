import BuildConstants.projectTitle

plugins {
    `java-version-script`
    `mod-build-script`
    `mod-publish-script`
    `kotest-script`
    `dokka-script`
    kotlin("plugin.serialization")
}

val modName by extra("$projectTitle NBT")
val modMixinFiles by extra(listOf("${rootProject.name}-nbt.mixins.json"))
