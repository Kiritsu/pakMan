$run = "x64"

if ([Environment]::Is64BitOperatingSystem) 
{
    $run = "x64"
}
else 
{
    $run = "x86"
}
echo $run
javaw "-Djava.library.path=..\j3d\$run" -classpath "..\bin;..\j3d\j3dcore.jar;..\j3d\j3dutils.jar;..\j3d\vecmath.jar" game.PakMan "--from-script"