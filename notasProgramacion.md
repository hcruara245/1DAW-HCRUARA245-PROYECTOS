# Apuntes

## Comparable y Comparator
### Comparable (compareTo, default)
```java
@Override
public int compareTo(Object o) {
  int res = 0;

  try {
    ProductoElectronico other = (ProductoElectronico) o;

    res = this.marca.compareTo(other.marca);

    if (res == 0) {
      res = this.modelo.compareTo(other.modelo);
    }
  } catch (ClassCastException ignored) {}

  return res;
}
```

### Comparator (compare)
```java
public class ComparadorPrecio implements Comparator {
  @Override
  public int compare(Object o, Object t1) {
    int res = 0;

    try {
      ProductoElectronico o1 = (ProductoElectronico) o;
      ProductoElectronico o2 = (ProductoElectronico) t1;

      res = (int) (o1.obtenerPrecio() - o2.obtenerPrecio());

      if (res == 0) {
        res = o1.compareTo(o2);
      }
    } catch (ClassCastException ignored) {}

    return res;
  }
}
```

## Ficheros
### Path
```java
String path = System.getProperty("user.dir")+"\\src\\main\\java\\ejercicios\\ud6\\boletinFicheros\\ejercicio11_1\\";
```

### File reader separando por espacios
```java
double[] numeros = new double[0];

try {
  FileReader fr = new FileReader("src/main/java/ejercicios/ud6/boletinFicheros/ejercicio10_4/Enteros.txt");

  int c;
  String num = "";

  while ((c = fr.read()) != -1) {
    if (c != ' ') {
      num += (char) c;
    } else {
      numeros = Arrays.copyOf(numeros, numeros.length+1);
      numeros[numeros.length-1] = Double.parseDouble(num);
      num = "";
    }
  }

  numeros = Arrays.copyOf(numeros, numeros.length+1);
  numeros[numeros.length-1] = Double.parseDouble(num);

  fr.close();
} catch (IOException e) {
  System.out.println("[ERROR] Error al leer y mostrar el archivo.");
}
```

### File reader con buffer y escaner
```java
double[] numeros = new double[0];
double suma = 0;
double numNumeros = 0;

try {
  FileReader fr = new FileReader("src/main/java/ejercicios/ud6/boletinFicheros/ejercicio10_5/Enteros.txt");
  BufferedReader br = new BufferedReader(fr);
  Scanner sc = new Scanner(br);

  while (sc.hasNext()) {
    try {
      suma += sc.nextDouble();
      numNumeros++;
    } catch (InputMismatchException e) {
      System.out.println("[ERROR] Error al leer un número, continuando.");
      sc.next();
    }
  }

  br.close();
} catch (IOException e) {
  System.out.println("[ERROR] Error al leer y mostrar el archivo.");
}
```

### File reader y writter
```java
try {
  BufferedReader br = new BufferedReader(new FileReader(path+fileName));
  FileWriter fw = new FileWriter(path+"copia_de_"+fileName);

  String line = br.readLine();

  while (line != null) {
    fw.write(line);
    if ((line = br.readLine()) != null) {
      fw.write('\n');
    }
  }

  br.close();
  fw.close();
} catch (IOException e) {
  System.out.println("- La ruta del archivo o el nombre son incorrectos. El archivo no se ha podido leer.");
}
```

### Write Object
```java
try {
  FileOutputStream fos = new FileOutputStream(path+"datos.dat");
  ObjectOutputStream oos = new ObjectOutputStream(fos);

  oos.writeObject(tabla);

  oos.close();
} catch (IOException e) {
  System.out.println("Error al escribir el objeto en el fichero.");
}
```

### Read Object
```java
try {
  FileInputStream fis = new FileInputStream(path+"registro.dat");
  ObjectInputStream ois = new ObjectInputStream(fis);

  registros = (RegistroTemp[]) ois.readObject();

  ois.close();
} catch (IOException ignored) {
} catch (ClassNotFoundException e) {
  System.out.println("[ERROR] Error al hacer casting a un objeto del fichero.");
}
```