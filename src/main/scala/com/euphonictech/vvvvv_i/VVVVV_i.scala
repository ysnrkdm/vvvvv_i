package com.euphonictech.vvvvv_i

import chisel3.{Bundle, Output, _}

class VVVVV_i extends Module {
  val io = IO(new Bundle {
    val led1 = Output(Bool())
  })

  io.led1 := true.B & ~reset.asBool()
}

object VVVVV_iPC extends App {
  chisel3.Driver.execute(args, () => new VVVVV_i)
}