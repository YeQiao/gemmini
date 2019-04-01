package systolic

import chisel3._

object SystolicISA {
  val LOAD_CMD = 2.U
  val STORE_CMD = 3.U
  val MODE_CMD = 0.U
  val COMPUTE_AND_FLIP_CMD = 4.U
  val COMPUTE_AND_STAY_CMD = 5.U
  val PRELOAD_CMD = 6.U
}
