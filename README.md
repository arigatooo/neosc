# Installation guide
## Install .NET Core 1.1.4
https://github.com/dotnet/core/blob/master/release-notes/download-archives/1.1.4-download.md

After installation, we need to make sure the dotnet compiler is in path directory and it is the 1.1.4 version
````text
$ dotnet --version
1.1.4
````

## Compile the neoj compiler
First, clone the project
```text
$ git clone https://github.com/neo-project/neo-compiler
```

Change to the `neo-compiler/neoj directory  
```text 
$ cd neo-compiler/neoj
```

Compile neoj  with dotnet compiler
```text
$ dotnet clean
Microsoft (R) Build Engine version 15.3.409.57025 for .NET Core
Copyright (C) Microsoft Corporation. All rights reserved.
```

```text
$ dotnet restore
Restoring packages for /Users/vferrer/NEO/neo-compiler/neoa/neoa.csproj...
Restoring packages for /Users/vferrer/NEO/neo-compiler/neon/neon.csproj...
Restore completed in 58,61 ms for /Users/vferrer/NEO/neo-compiler/neoj/neoj.csproj.
Generating MSBuild file /Users/vferrer/NEO/neo-compiler/neoa/obj/neoa.csproj.nuget.g.props.
Generating MSBuild file /Users/vferrer/NEO/neo-compiler/neoa/obj/neoa.csproj.nuget.g.targets.
Restore completed in 795,66 ms for /Users/vferrer/NEO/neo-compiler/neoa/neoa.csproj.
Installing antshares.monocecil 1.0.0.
Generating MSBuild file /Users/vferrer/NEO/neo-compiler/neon/obj/neon.csproj.nuget.g.props.
Generating MSBuild file /Users/vferrer/NEO/neo-compiler/neon/obj/neon.csproj.nuget.g.targets.
Restore completed in 2,87 sec for /Users/vferrer/NEO/neo-compiler/neon/neon.csproj.
```

```text
$ dotnet build -c Release
Microsoft (R) Build Engine version 15.3.409.57025 for .NET Core
Copyright (C) Microsoft Corporation. All rights reserved.

  neoj -> /Users/vferrer/NEO/neo-compiler/neoj/bin/Release/netcoreapp1.1/neoj.dll
  neoa -> /Users/vferrer/NEO/neo-compiler/neoa/bin/Release/netcoreapp1.0/neoa.dll
MSIL/ILModule.cs(226,42): warning CS0168: The variable 'err' is declared but never used [/Users/vferrer/NEO/neo-compiler/neon/neon.csproj]
MSIL/Converter.cs(160,42): warning CS0168: The variable 'err' is declared but never used [/Users/vferrer/NEO/neo-compiler/neon/neon.csproj]
MSIL/ILModule.cs(148,50): warning CS0168: The variable 'err' is declared but never used [/Users/vferrer/NEO/neo-compiler/neon/neon.csproj]
MSIL/ILModule.cs(173,58): warning CS0168: The variable 'err' is declared but never used [/Users/vferrer/NEO/neo-compiler/neon/neon.csproj]
MSIL/Converter.cs(542,21): warning CS0162: Unreachable code detected [/Users/vferrer/NEO/neo-compiler/neon/neon.csproj]
MSIL/Conv_Multi.cs(937,13): warning CS0162: Unreachable code detected [/Users/vferrer/NEO/neo-compiler/neon/neon.csproj]
  neon -> /Users/vferrer/NEO/neo-compiler/neon/bin/Release/netcoreapp1.0/neon.dll

Build succeeded.

MSIL/ILModule.cs(226,42): warning CS0168: The variable 'err' is declared but never used [/Users/vferrer/NEO/neo-compiler/neon/neon.csproj]
MSIL/Converter.cs(160,42): warning CS0168: The variable 'err' is declared but never used [/Users/vferrer/NEO/neo-compiler/neon/neon.csproj]
MSIL/ILModule.cs(148,50): warning CS0168: The variable 'err' is declared but never used [/Users/vferrer/NEO/neo-compiler/neon/neon.csproj]
MSIL/ILModule.cs(173,58): warning CS0168: The variable 'err' is declared but never used [/Users/vferrer/NEO/neo-compiler/neon/neon.csproj]
MSIL/Converter.cs(542,21): warning CS0162: Unreachable code detected [/Users/vferrer/NEO/neo-compiler/neon/neon.csproj]
MSIL/Conv_Multi.cs(937,13): warning CS0162: Unreachable code detected [/Users/vferrer/NEO/neo-compiler/neon/neon.csproj]
    6 Warning(s)
    0 Error(s)

Time Elapsed 00:00:04.57
```

## Maven install neo-dev-pack
```text
$ git clone https://github.com/neo-project/neo-devpack-java.git
```

```text
$ cd neo-devpack-java
$ mvn clean install 
...
[INFO] --- maven-install-plugin:2.4:install (default-install) @ neo-devpack-java ---
[INFO] Installing /Users/vferrer/NEO/neo-devpack-java/target/neo-devpack-java-2.3.0.jar to /Users/vferrer/.m2/repository/org/neo/smartcontract/framework/neo-devpack-java/2.3.0/neo-devpack-java-2.3.0.jar
[INFO] Installing /Users/vferrer/NEO/neo-devpack-java/pom.xml to /Users/vferrer/.m2/repository/org/neo/smartcontract/framework/neo-devpack-java/2.3.0/neo-devpack-java-2.3.0.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.893 s
[INFO] Finished at: 2018-02-03T15:01:33+01:00
[INFO] Final Memory: 19M/172M
[INFO] ------------------------------------------------------------------------
```