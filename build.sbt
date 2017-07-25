scriptedSettings

scriptedBufferLog := false

scriptedLaunchOpts ++= sys.process.javaVmArguments.filter(
  a => Seq("-X").exists(a.startsWith)
)
