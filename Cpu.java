package Tugas;

import java.text.NumberFormat;
import java.util.Locale;
public class Cpu {
    private double harga;
    private String merek;

    public Cpu(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }
    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
            int jumlahRAM;
            String manufacturer;

            RAM(int jumlahRAM, String manufacturer) {
                this.jumlahRAM = jumlahRAM;
                this.manufacturer = manufacturer;
            }

            public void getInfoRAM() {
                System.out.println("Jumlah RAM: " + this.jumlahRAM);
                System.out.println("Pabrik: " + this.manufacturer);
            }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }
     class Komputer {
        private String name;
        private int Jumlah;
    
        public Komputer(String name, int Jumlah) {
            this.name = name;
            this.Jumlah = Jumlah;
        }
    
        public void showInfo() {
            System.out.println("Macam Macam Bagian Komputer");
        }
    
        public class Harddisk {
            private String name;
            private String Internal;
            private double Jumlah;
            private double Harga;
    
            public Harddisk(String name, int Jumlah, String Internal, double Harga) {
                this.name = name;
                this.Jumlah = Jumlah;
                this.Internal = Internal;
                this.Harga = Harga;
            }
    
            public void GetInfoHardisk() {
                Locale localeID = new Locale("in", "ID");
                NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
    
                System.out.println("Nama Harddisk : " + this.name);
                System.out.println("Internal GigaByte : " + this.Jumlah + " "+ this.Internal);
                System.out.println("Harga: " + formatRupiah.format(this.Harga));
            }
    
            public class Motherboard {
                private String name;
                private String DDR;
                private double Harga;
    
                public Motherboard(String name, double Harga, String DDR) {
                    this.name = name;
                    this.Harga = Harga;
                    this.DDR = DDR;
                }
    
                public void GetInfoMotherboard() {
                    Locale localeID = new Locale("in", "ID");
                    NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
    
                    System.out.println("Nama Motherboard : " + this.name);
                    System.out.println("Harga: " + formatRupiah.format(this.Harga));
                    System.out.println("DDR : " + this.DDR);
                }
    
                public class PowerSupply {
                    private String name;
                    private double Harga;
    
                    public PowerSupply(String name, double Harga) {
                        this.name = name;
                        this.Harga = Harga;
                    }
    
                    public void GetInfoPowerSupply() {
                        Locale localeID = new Locale("in", "ID");
                        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
                        System.out.println("Tipe Power Supply : " + this.name);
                        System.out.println("Harga: " + formatRupiah.format(this.Harga));
                    }
    
                    public class VGACard {
                        private String name;
                        private double Harga;
    
                        public VGACard(String name, double Harga) {
                            this.name = name;
                            this.Harga = Harga;
                        }
    
                        public void GetInfoVGA() {
                            Locale localeID = new Locale("in", "ID");
                            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
                            System.out.println("Nama VGA Card : " + this.name);
                            System.out.println("Harga: " + formatRupiah.format(this.Harga));
                        }
                    }
                }
            }
        }
    }
}