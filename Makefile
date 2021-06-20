
SBT = sbt


# Generate Verilog code

alu:
	$(SBT) "runMain gcd.AluMain"
