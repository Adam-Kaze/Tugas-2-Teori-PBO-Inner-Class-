package Tugas;

import Tugas.Cpu.Komputer;
import Tugas.Cpu.Komputer.Harddisk;
import Tugas.Cpu.Komputer.Harddisk.Motherboard;

public class Main {
    public static void main(String[] args) {
        Cpu myComputer = new Cpu(15000000, "Lenovo");
        Cpu.Processor i7 = myComputer.new Processor(8, "Intel", "i7");
        Cpu.RAM rs32GB = myComputer.new RAM(32, "Samsung");

        myComputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();
        System.out.println();
        Cpu.Komputer Gaming = myComputer.new Komputer("pc Gaming" , 1);
        Gaming.showInfo();
        Cpu.Komputer.Harddisk SATA = Gaming.new Harddisk("Harrdisk SATA",2048,"GB",2300000);
        SATA.GetInfoHardisk();
        System.out.println();
        Cpu.Komputer.Harddisk.Motherboard motherboard = SATA.new Motherboard("Micro-ATX (mATX)",550000,"DDR4");
        motherboard.GetInfoMotherboard();
        System.out.println();
        Cpu.Komputer.Harddisk.Motherboard.PowerSupply PS = motherboard.new PowerSupply("ATX Power Supply", 125000);
        PS.GetInfoPowerSupply();
        System.out.println();
        Cpu.Komputer.Harddisk.Motherboard.PowerSupply.VGACard VGA = PS.new VGACard("Radeon RX Series", 1200000);
        VGA.GetInfoVGA();
    }
}