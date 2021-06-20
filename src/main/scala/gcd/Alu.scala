
import chisel3._
import chisel3.util._

/**
 * Basic 32 bit Alu module for RV32I .... Still under Development
 */
class Alu extends Module {
  val io = IO(new Bundle {
    val funct = Input(UInt(2.W))
    val a = Input(UInt(32.W))
    val b = Input(UInt(32.W))
    val result = Output(UInt(32.W))
  })

  // Use shorter variable names
  val funct = io.funct
  val a     = io.a
  val b     = io.b

  val result = Wire(UInt(32.W))
  // some default value is needed
  result := 0.U

  // The ALU selection
  switch(funct) {
    is(0.U) { result := a + b }
    is(1.U) { result := a - b }
    is(2.U) { result := a | b }
    is(3.U) { result := a & b }
  }

  // Output on the LEDs
  io.result := result
}


// Generate the Verilog code
object AluMain extends App {
  println("Generating the ALU hardware")
  (new chisel3.stage.ChiselStage).emitVerilog(new Alu(), Array("--target-dir", "generated"))

}
