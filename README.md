Temporary Repo for Chisel practice (Adopted from Chisel Project Template)
=========================================================================


### Dependencies

#### JDK 8 or newer

We recommend LTS releases Java 8 and Java 11. You can install the JDK as recommended by your operating system, or use the prebuilt binaries from [AdoptOpenJDK](https://adoptopenjdk.net/).

#### SBT or mill

SBT is the most common built tool in the Scala community. You can download it [here](https://www.scala-sbt.org/download.html).  
mill is another Scala/Java build tool without obscure DSL like SBT. You can download it [here](https://github.com/com-lihaoyi/mill/releases)

### How to get started

#### Clone your repository

```sh
$ git clone https://github.com/Kian75/Chisel_Examples.git
$ cd Chisel_Examples
```
### You should now have a working Chisel3 project.

You can run the main code with:
```sh
$ sbt run
```
or:
```sh
$ make
```
You can run the included test with:
```sh
$ sbt test
```

You should see a whole bunch of output that ends with something like the following lines
```
[info] Tests: succeeded 1, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 5 s, completed Dec 16, 2020 12:18:44 PM
```
### Adding your own code:

If you want to write your own code and extend this repo, you can go to src/main/scala/simple and add your code.
If you want to add your test code you can go to src/test/scala/simple and add your code.
Then you can edit the makefile. The procedure is very easy and can be done like the simple ALU code that I have in this repo.

### I would like to mention following repositories:
https://github.com/schoeberl/chisel-examples.git

https://github.com/ucb-bar/riscv-mini.git

Lots of things I have learned about Chisel comes from above repsitories
