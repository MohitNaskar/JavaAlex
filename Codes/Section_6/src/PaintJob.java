class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4,1.5));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket,int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        else{
            double area = (width * height);
            double totalArea = areaPerBucket * extraBuckets;
            if (area - totalArea != 0) {
                double areaLeft = area - totalArea;
                return (int) Math.ceil(areaLeft/areaPerBucket);
            }
        }
        return -1;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        else{
            double area = (width * height);
            return (int) Math.ceil(area/areaPerBucket);
        }
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        else{
            return (int) Math.ceil(area/areaPerBucket);
        }
    }
}
