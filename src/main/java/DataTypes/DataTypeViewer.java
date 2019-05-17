package DataTypes;

public class DataTypeViewer
{

    public static void main(String[] args)
    {
        printTypeInfo("Boolean",
                      getStr(Boolean.FALSE),
                      getStr(Boolean.TRUE),
                      1);

        printTypeInfo("Byte",
                      getStr(Byte.MIN_VALUE),
                      getStr(Byte.MAX_VALUE),
                      Byte.SIZE);

        printTypeInfo("Character",
                      "\\u0000",
                      "\\uFFFF",
                      Character.SIZE);

        printTypeInfo("Short",
                      getStr(Short.MIN_VALUE),
                      getStr(Short.MAX_VALUE),
                      Short.SIZE);

        printTypeInfo("Integer",
                      getStr(Integer.MIN_VALUE),
                      getStr(Integer.MAX_VALUE),
                      Integer.SIZE);

        printTypeInfo("Long",
                      getStr(Long.MIN_VALUE),
                      getStr(Long.MAX_VALUE),
                      Long.SIZE);

        printTypeInfo("Float",
                      getStr(Float.MIN_VALUE),
                      getStr(Float.MAX_VALUE),
                      Float.SIZE);

        printTypeInfo("Double",
                      getStr(Double.MIN_VALUE),
                      getStr(Double.MAX_VALUE),
                      Double.SIZE);
    }

    private static void printTypeInfo(String dataTypeName, String minValue, String maxValue, int sizeInBits)
    {
        System.out.println("--- " + dataTypeName + " ---");
        System.out.println("Min Value: " + minValue);
        System.out.println("Max Value: " + maxValue);
        System.out.println("Number of Bits: " + sizeInBits);

        if (sizeInBits % 8 == 0) //Don't display bytes for Boolean
        {
            System.out.println("Number of Bytes: " + sizeInBits / 8); //8 bits in a byte
        }

        System.out.println();
    }

    private static String getStr(Object obj)
    {
        return obj.toString();
    }
}
