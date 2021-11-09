import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("1", "Tu lanh", 600000, Product.Category.DGD, 20, 10));
        products.add(new Product("2", "Banh mi", 10000, Product.Category.TP, 28, 1));
        products.add(new Product("3", "Son mi mat", 500000, Product.Category.MP, 40, 8));
        products.add(new Product("4", "Hoodie", 300000, Product.Category.TT, 22, 5));
        products.add(new Product("5", "May say", 90000, Product.Category.DGD, 11, 12));

        System.out.println("1. In thông tin tất cả sản phẩm ra màn hình");
        System.out.println("2. In thông tin các sản phẩm có giá lớn hơn 100.000");
        System.out.println("3. Sắp xếp sản phẩm theo số lượng bán được");
        System.out.println("4. Lấy ra sản phẩm bán chạy nhất");
        System.out.println("5. In thông tin sản phẩm theo danh mục:");
        System.out.println("6. Tìm kiếm sản phẩm theo tên");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap lua chon: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                printListProduct(products);
                break;
            case 2:
                cau2(products);
                break;
            case 3:
                cau3(products);
                break;
            case 4:
                cau4(products);
                break;
            case 5:
                cau5(products);
                break;
            case 6:
                cau6(products);
                break;
        }

    }

    public static void printListProduct(ArrayList<Product> list) {
        System.out.println("1. In thông tin tất cả sản phẩm ra màn hình");
        for (Product p : list) {
            System.out.println(p);
        }
    }

    public static void cau2(ArrayList<Product> list) {
        System.out.println("2. In thông tin các sản phẩm có giá lớn hơn 100.000");
        for (Product p : list) {
            if (p.price > 100000) {
                System.out.println(p);
            }
        }
    }

    public static void cau3(ArrayList<Product> list) {
        System.out.println("3. Sắp xếp sản phẩm theo số lượng bán được");
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getSold() - o2.getSold();
            }
        });
    }

    public static void cau4(ArrayList<Product> list) {
        System.out.println("4. Lấy ra sản phẩm bán chạy nhất");
        Product max = list.stream().max(Comparator.comparing(Product::getSold)).get();
        System.out.println(max);
    }

    public static void cau5(ArrayList<Product> list) {
        System.out.println("5. In thông tin sản phẩm theo danh mục:");
        Arrays.asList(Product.Category.values()).forEach(category -> {
            System.out.println(category);
            for (Product p: list) {
                if (p.getCategory() == category) {
                    System.out.println(p);
                }
            }
        });
    }

    public static void cau6(ArrayList<Product> list) {
        System.out.println("6. Tìm kiếm sản phẩm theo tên");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu khoa tim kiem: ");
        String searchParam = sc.nextLine();
        list.removeIf(product -> !product.getName().contains(searchParam));
        for (Product p : list) {
            System.out.println(p);
        }
    }

}
