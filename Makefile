
SBT = sbt


# Generate Verilog code

alu:
	$(SBT) "runMain Simple.AluMain"
