import math

def calculate_circle():
    radius = float(input("Enter the radius of the circle: "))
    area = math.pi * radius**2
    circumference = 2 * math.pi * radius
    print(f"Area of the circle: {area:.2f}")
    print(f"Circumference of the circle: {circumference:.2f}")

def calculate_square():
    side = float(input("Enter the side length of the square: "))
    area = side**2
    perimeter = 4 * side
    print(f"Area of the square: {area:.2f}")
    print(f"Perimeter of the square: {perimeter:.2f}")

def calculate_rectangle():
    length = float(input("Enter the length of the rectangle: "))
    width = float(input("Enter the width of the rectangle: "))
    area = length * width
    perimeter = 2 * (length + width)
    print(f"Area of the rectangle: {area:.2f}")
    print(f"Perimeter of the rectangle: {perimeter:.2f}")

def calculate_triangle():
    base = float(input("Enter the base of the triangle: "))
    height = float(input("Enter the height of the triangle: "))
    area = 0.5 * base * height
    print(f"Area of the triangle: {area:.2f}")
    
    side_a = float(input("Enter the length of the first side: "))
    side_b = float(input("Enter the length of the second side: "))
    perimeter = side_a + side_b + base
    print(f"Perimeter of the triangle: {perimeter:.2f}")

def calculate_oval():
    major_axis = float(input("Enter the length of the major axis: "))
    minor_axis = float(input("Enter the length of the minor axis: "))
    area = math.pi * major_axis * minor_axis / 4
    circumference = math.pi * (3 * (major_axis + minor_axis) - math.sqrt((3 * major_axis + minor_axis) * (major_axis + 3 * minor_axis)))
    print(f"Area of the oval: {area:.2f}")
    print(f"Circumference of the oval: {circumference:.2f}")

def calculate_pentagon():
    side = float(input("Enter the length of one side of the pentagon: "))
    area = (1/4) * math.sqrt(5 * (5 + 2 * math.sqrt(5))) * side**2
    perimeter = 5 * side
    print(f"Area of the pentagon: {area:.2f}")
    print(f"Perimeter of the pentagon: {perimeter:.2f}")

def calculate_hexagon():
    side = float(input("Enter the length of one side of the hexagon: "))
    area = (3 * math.sqrt(3) / 2) * side**2
    perimeter = 6 * side
    print(f"Area of the hexagon: {area:.2f}")
    print(f"Perimeter of the hexagon: {perimeter:.2f}")

def calculate_heptagon():
    side = float(input("Enter the length of one side of the heptagon: "))
    area = (7/4) * side**2 / math.tan(math.pi / 7)
    perimeter = 7 * side
    print(f"Area of the heptagon: {area:.2f}")
    print(f"Perimeter of the heptagon: {perimeter:.2f}")

def calculate_octagon():
    side = float(input("Enter the length of one side of the octagon: "))
    area = 2 * (1 + math.sqrt(2)) * side**2
    perimeter = 8 * side
    print(f"Area of the octagon: {area:.2f}")
    print(f"Perimeter of the octagon: {perimeter:.2f}")

def calculate_nonagon():
    side = float(input("Enter the length of one side of the nonagon: "))
    area = (9/4) * side**2 / math.tan(math.pi / 9)
    perimeter = 9 * side
    print(f"Area of the nonagon: {area:.2f}")
    print(f"Perimeter of the nonagon: {perimeter:.2f}")

def calculate_decagon():
    side = float(input("Enter the length of one side of the decagon: "))
    area = (5/2) * side**2 / math.tan(math.pi / 10)
    perimeter = 10 * side
    print(f"Area of the decagon: {area:.2f}")
    print(f"Perimeter of the decagon: {perimeter:.2f}")

def calculate_trapezium():
    base1 = float(input("Enter the length of the first base: "))
    base2 = float(input("Enter the length of the second base: "))
    height = float(input("Enter the height of the trapezium: "))
    area = ((base1 + base2) / 2) * height
    side_a = float(input("Enter the length of the first non-parallel side: "))
    side_b = float(input("Enter the length of the second non-parallel side: "))
    perimeter = base1 + base2 + side_a + side_b
    print(f"Area of the trapezium: {area:.2f}")
    print(f"Perimeter of the trapezium: {perimeter:.2f}")

def calculate_parallelogram():
    base = float(input("Enter the length of the base: "))
    height = float(input("Enter the height: "))
    area = base * height
    side = float(input("Enter the length of one side: "))
    perimeter = 2 * (base + side)
    print(f"Area of the parallelogram: {area:.2f}")
    print(f"Perimeter of the parallelogram: {perimeter:.2f}")

def calculate_rhomboid():
    base = float(input("Enter the length of the base: "))
    height = float(input("Enter the height: "))
    area = base * height
    side_a = float(input("Enter the length of the first side: "))
    side_b = float(input("Enter the length of the second side: "))
    perimeter = 2 * (side_a + side_b)
    print(f"Area of the rhomboid: {area:.2f}")
    print(f"Perimeter of the rhomboid: {perimeter:.2f}")

def calculate_rhombus():
    diagonal1 = float(input("Enter the length of the first diagonal: "))
    diagonal2 = float(input("Enter the length of the second diagonal: "))
    area = (diagonal1 * diagonal2) / 2
    side = float(input("Enter the length of one side of the rhombus: "))
    perimeter = 4 * side
    print(f"Area of the rhombus: {area:.2f}")
    print(f"Perimeter of the rhombus: {perimeter:.2f}")

def calculate_star():
    # A simplified star shape calculation (five-pointed star)
    outer_radius = float(input("Enter the outer radius of the star: "))
    inner_radius = float(input("Enter the inner radius of the star: "))
    area = (5 * outer_radius * outer_radius * math.sin(math.radians(72)) / 2) - \
           (5 * inner_radius * inner_radius * math.sin(math.radians(36)) / 2)
    perimeter = 10 * (outer_radius + inner_radius)  # Simplified approximation
    print(f"Area of the star: {area:.2f}")
    print(f"Perimeter of the star: {perimeter:.2f}")

def calculate_heart():
    # Simplified heart shape area calculation
    a = float(input("Enter the size parameter for the heart: "))
    area = (16 * (a ** 3) - (4 * a ** 2) + (a ** 2) * math.sqrt(a)) / 3
    print(f"Area of the heart: {area:.2f}")

def calculate_crescent():
    radius_outer = float(input("Enter the outer radius of the crescent: "))
    radius_inner = float(input("Enter the inner radius of the crescent: "))
    area = math.pi * (radius_outer**2 - radius_inner**2)
    print(f"Area of the crescent: {area:.2f}")

def calculate_sector():
    radius = float(input("Enter the radius of the sector: "))
    angle = float(input("Enter the angle in degrees: "))
    area = (angle / 360) * math.pi * radius**2
    arc_length = (angle / 360) * 2 * math.pi * radius
    print(f"Area of the sector: {area:.2f}")
    print(f"Arc length of the sector: {arc_length:.2f}")

def calculate_annulus():
    radius_outer = float(input("Enter the outer radius of the annulus: "))
    radius_inner = float(input("Enter the inner radius of the annulus: "))
    area = math.pi * (radius_outer**2 - radius_inner**2)
    print(f"Area of the annulus: {area:.2f}")

def calculate_sphere():
    radius = float(input("Enter the radius of the sphere: "))
    volume = (4/3) * math.pi * radius**3
    surface_area = 4 * math.pi * radius**2
    print(f"Volume of the sphere: {volume:.2f}")
    print(f"Surface Area of the sphere: {surface_area:.2f}")

def calculate_cube():
    side = float(input("Enter the side length of the cube: "))
    volume = side**3
    surface_area = 6 * side**2
    print(f"Volume of the cube: {volume:.2f}")
    print(f"Surface Area of the cube: {surface_area:.2f}")

def calculate_rectangular_prism():
    length = float(input("Enter the length of the prism: "))
    width = float(input("Enter the width of the prism: "))
    height = float(input("Enter the height of the prism: "))
    volume = length * width * height
    surface_area = 2 * (length * width + width * height + height * length)
    print(f"Volume of the rectangular prism: {volume:.2f}")
    print(f"Surface Area of the rectangular prism: {surface_area:.2f}")

def calculate_cylinder():
    radius = float(input("Enter the radius of the cylinder: "))
    height = float(input("Enter the height of the cylinder: "))
    volume = math.pi * radius**2 * height
    surface_area = 2 * math.pi * radius * (height + radius)
    print(f"Volume of the cylinder: {volume:.2f}")
    print(f"Surface Area of the cylinder: {surface_area:.2f}")

def calculate_cone():
    radius = float(input("Enter the radius of the cone: "))
    height = float(input("Enter the height of the cone: "))
    volume = (1/3) * math.pi * radius**2 * height
    slant_height = math.sqrt(radius**2 + height**2)
    surface_area = math.pi * radius * (radius + slant_height)
    print(f"Volume of the cone: {volume:.2f}")
    print(f"Surface Area of the cone: {surface_area:.2f}")

def calculate_pyramid():
    base_area = float(input("Enter the base area of the pyramid: "))
    height = float(input("Enter the height of the pyramid: "))
    volume = (1/3) * base_area * height
    print(f"Volume of the pyramid: {volume:.2f}")

def calculate_torus():
    major_radius = float(input("Enter the major radius of the torus: "))
    minor_radius = float(input("Enter the minor radius of the torus: "))
    volume = (math.pi**2) * (minor_radius**2) * (major_radius)
    surface_area = (2 * math.pi * major_radius) * (2 * math.pi * minor_radius)
    print(f"Volume of the torus: {volume:.2f}")
    print(f"Surface Area of the torus: {surface_area:.2f}")

def calculate_ellipsoid():
    semi_axis_a = float(input("Enter the length of the semi-axis a: "))
    semi_axis_b = float(input("Enter the length of the semi-axis b: "))
    semi_axis_c = float(input("Enter the length of the semi-axis c: "))
    volume = (4/3) * math.pi * semi_axis_a * semi_axis_b * semi_axis_c
    surface_area = 4 * math.pi * ((semi_axis_a * semi_axis_b)**(1.6) + (semi_axis_a * semi_axis_c)**(1.6) + (semi_axis_b * semi_axis_c)**(1.6)) / 3**(1/1.6)
    print(f"Volume of the ellipsoid: {volume:.2f}")
    print(f"Surface Area of the ellipsoid: {surface_area:.2f}")

def calculate_prism():
    base_area = float(input("Enter the base area of the prism: "))
    height = float(input("Enter the height of the prism: "))
    volume = base_area * height
    print(f"Volume of the prism: {volume:.2f}")

def calculate_dodecahedron():
    side = float(input("Enter the length of one side of the dodecahedron: "))
    volume = (15 + 7 * math.sqrt(5)) / 4 * side**3
    surface_area = 3 * math.sqrt(25 + 10 * math.sqrt(5)) * side**2
    print(f"Volume of the dodecahedron: {volume:.2f}")
    print(f"Surface Area of the dodecahedron: {surface_area:.2f}")

def main():
    print("Welcome to the Comprehensive Area and Volume Calculator!")
    print("Choose a shape to calculate:")
    print("1. Circle")
    print("2. Square")
    print("3. Rectangle")
    print("4. Triangle")
    print("5. Oval")
    print("6. Pentagon")
    print("7. Hexagon")
    print("8. Heptagon")
    print("9. Octagon")
    print("10. Nonagon")
    print("11. Decagon")
    print("12. Trapezium")
    print("13. Parallelogram")
    print("14. Rhomboid")
    print("15. Rhombus")
    print("16. Star")
    print("17. Heart")
    print("18. Crescent")
    print("19. Sector")
    print("20. Annulus")
    print("21. Sphere")
    print("22. Cube")
    print("23. Rectangular Prism")
    print("24. Cylinder")
    print("25. Cone")
    print("26. Pyramid")
    print("27. Torus")
    print("28. Ellipsoid")
    print("29. Prism")
    print("30. Dodecahedron")
    
    choice = input("Enter the number of the shape (1-30): ")

    if choice == '1':
        calculate_circle()
    elif choice == '2':
        calculate_square()
    elif choice == '3':
        calculate_rectangle()
    elif choice == '4':
        calculate_triangle()
    elif choice == '5':
        calculate_oval()
    elif choice == '6':
        calculate_pentagon()
    elif choice == '7':
        calculate_hexagon()
    elif choice == '8':
        calculate_heptagon()
    elif choice == '9':
        calculate_octagon()
    elif choice == '10':
        calculate_nonagon()
    elif choice == '11':
        calculate_decagon()
    elif choice == '12':
        calculate_trapezium()
    elif choice == '13':
        calculate_parallelogram()
    elif choice == '14':
        calculate_rhomboid()
    elif choice == '15':
        calculate_rhombus()
    elif choice == '16':
        calculate_star()
    elif choice == '17':
        calculate_heart()
    elif choice == '18':
        calculate_crescent()
    elif choice == '19':
        calculate_sector()
    elif choice == '20':
        calculate_annulus()
    elif choice == '21':
        calculate_sphere()
    elif choice == '22':
        calculate_cube()
    elif choice == '23':
        calculate_rectangular_prism()
    elif choice == '24':
        calculate_cylinder()
    elif choice == '25':
        calculate_cone()
    elif choice == '26':
        calculate_pyramid()
    elif choice == '27':
        calculate_torus()
    elif choice == '28':
        calculate_ellipsoid()
    elif choice == '29':
        calculate_prism()
    elif choice == '30':
        calculate_dodecahedron()
    else:
        print("Invalid choice. Please choose a number between 1 and 30.")

if __name__ == "__main__":
    main()
