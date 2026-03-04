    Scanner sc = new Scanner(System.in);

    int n;

    System.out.print("Enter size of square matrix: ");
    n = sc.nextInt();

    int[][] a = new int[n][n];


    System.out.println("Enter elements:");
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            a[i][j] = sc.nextInt();
        }
    }


    System.out.println("Matrix:");
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }


    System.out.println("Row sums:");
    for(int i = 0; i < n; i++) {
        int sum = 0;
        for(int j = 0; j < n; j++) {
            sum = sum + a[i][j];
        }
        System.out.println(sum);
    }


    System.out.println("Column sums:");
    for(int j = 0; j < n; j++) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + a[i][j];
        }
        System.out.println(sum);
    }


    int d1 = 0;
    for(int i = 0; i < n; i++) {
        d1 = d1 + a[i][i];
    }
    System.out.println("Forward diagonal sum = " + d1);


    int d2 = 0;
    for(int i = 0; i < n; i++) {
        d2 = d2 + a[i][n - 1 - i];
    }
    System.out.println("Reverse diagonal sum = " + d2);

}
