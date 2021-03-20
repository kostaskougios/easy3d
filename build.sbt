val dottyVersion = "3.0.0-RC1"

version in ThisBuild := "1.0"

scalaVersion in ThisBuild := dottyVersion

scalacOptions in ThisBuild ++= Seq("-unchecked", "-feature", "-deprecation")

val LwjglVersion = "3.2.3"
val LwjglNatives = "natives-linux"

val LWJGL = Seq(
  "org.lwjgl" % "lwjgl" % LwjglVersion,
  "org.lwjgl" % "lwjgl-assimp" % LwjglVersion,
  "org.lwjgl" % "lwjgl-bgfx" % LwjglVersion,
  "org.lwjgl" % "lwjgl-cuda" % LwjglVersion,
  "org.lwjgl" % "lwjgl-egl" % LwjglVersion,
  "org.lwjgl" % "lwjgl-glfw" % LwjglVersion,
  "org.lwjgl" % "lwjgl-jawt" % LwjglVersion,
  "org.lwjgl" % "lwjgl-jemalloc" % LwjglVersion,
  "org.lwjgl" % "lwjgl-libdivide" % LwjglVersion,
  "org.lwjgl" % "lwjgl-llvm" % LwjglVersion,
  "org.lwjgl" % "lwjgl-lmdb" % LwjglVersion,
  "org.lwjgl" % "lwjgl-lz4" % LwjglVersion,
  "org.lwjgl" % "lwjgl-meow" % LwjglVersion,
  "org.lwjgl" % "lwjgl-nanovg" % LwjglVersion,
  "org.lwjgl" % "lwjgl-nfd" % LwjglVersion,
  "org.lwjgl" % "lwjgl-nuklear" % LwjglVersion,
  "org.lwjgl" % "lwjgl-odbc" % LwjglVersion,
  "org.lwjgl" % "lwjgl-openal" % LwjglVersion,
  "org.lwjgl" % "lwjgl-openal" % LwjglVersion,
  "org.lwjgl" % "lwjgl-opencl" % LwjglVersion,
  "org.lwjgl" % "lwjgl-opengl" % LwjglVersion,
  "org.lwjgl" % "lwjgl-opengles" % LwjglVersion,
  "org.lwjgl" % "lwjgl-openvr" % LwjglVersion,
  "org.lwjgl" % "lwjgl-opus" % LwjglVersion,
  "org.lwjgl" % "lwjgl-par" % LwjglVersion,
  "org.lwjgl" % "lwjgl-remotery" % LwjglVersion,
  "org.lwjgl" % "lwjgl-rpmalloc" % LwjglVersion,
  "org.lwjgl" % "lwjgl-shaderc" % LwjglVersion,
  "org.lwjgl" % "lwjgl-sse" % LwjglVersion,
  "org.lwjgl" % "lwjgl-stb" % LwjglVersion,
  "org.lwjgl" % "lwjgl-tinyexr" % LwjglVersion,
  "org.lwjgl" % "lwjgl-tinyfd" % LwjglVersion,
  "org.lwjgl" % "lwjgl-tootle" % LwjglVersion,
  "org.lwjgl" % "lwjgl-vma" % LwjglVersion,
  "org.lwjgl" % "lwjgl-vulkan" % LwjglVersion,
  "org.lwjgl" % "lwjgl-xxhash" % LwjglVersion,
  "org.lwjgl" % "lwjgl-yoga" % LwjglVersion,
  "org.lwjgl" % "lwjgl-zstd" % LwjglVersion,
  "org.lwjgl" % "lwjgl" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-assimp" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-bgfx" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-glfw" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-jemalloc" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-libdivide" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-llvm" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-lmdb" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-lz4" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-meow" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-nanovg" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-nfd" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-nuklear" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-openal" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-openal" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-opengl" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-opengles" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-openvr" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-opus" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-par" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-remotery" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-rpmalloc" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-shaderc" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-sse" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-stb" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-tinyexr" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-tinyfd" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-tootle" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-vma" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-xxhash" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-yoga" % LwjglVersion classifier (LwjglNatives),
  "org.lwjgl" % "lwjgl-zstd" % LwjglVersion classifier (LwjglNatives),
)


val commonSettings = Seq(
  version := "1.0",
)

lazy val lib = project
  .settings(
    commonSettings,
    libraryDependencies ++= LWJGL
  )
