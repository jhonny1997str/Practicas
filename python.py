import webbrowser

usuarios = {
    "Carlos": {"contraseña": "7125", "id": "5234" },
    "Jhonny": {"contraseña": "0838", "id": "0125", "telefono": "3006847371" }
}


def abrir_enlace(url):
    webbrowser.open(url)


url = "https://github.com/jhonny1997str"



def menu():
    print("1. Registro")
    print("2. Ingresar")
    print("3. Actualizar datos")
    print("4. Salir")



def registro():
    print("INICIANDO REGISTRO")
    while True:
        new_name = input("Ingrese su primer nombre: ").capitalize()
        if any(usuario["id"] == new_name for usuario in usuarios.values()):
            print("El nombre ingresado ya está registrado.")
            continue
        
        new_id = input("Ingrese su ID number: ")
        if any(usuario["id"] == new_id for usuario in usuarios.values()):
            print("El ID ingresado ya está registrado.")
            return
        
        while True:
            try:
                new_key = int(input("Ingrese una contraseña de 4 dígitos numéricos: "))
                if len(str(new_key)) != 4:
                    print("La contraseña debe tener exactamente 4 dígitos.")
                    continue
                break
            except ValueError:
                print("La contraseña debe contener solo números.")
        
        usuarios[new_name] = {"contraseña": str(new_key), "id": new_id}
        print(f"Usuario '{new_name}' agregado correctamente. Ya puedes iniciar sesión.")
        break

def ingresar():
    print("INICIANDO SESIÓN")
    id_ingresado = input("Ingrese su ID: ")
    for usuario, datos in usuarios.items():
        if datos["id"] == id_ingresado:
            nombre = usuario
            print(f"Hola {nombre}")
            break
            
    else:
        print("Usuario no registrado")
        return

    while True:
        contraseña_ingresada = input("Ingrese la contraseña: ")
        acceso_concedido = False  
    
        for usuario, clave in usuarios.items():
            if clave["contraseña"] == str(contraseña_ingresada):
                nombre = usuario
                print("Accediendo al Sistema")
                acceso_concedido = True
                break  
    
        if acceso_concedido:
            break 
    
        print("Error: Contraseña Incorrecta. Inténtelo de nuevo.")

    print(f"Bienvenido, {nombre}!..Ingresando a tu GITHUB. ")
    abrir_enlace(url)
    

def actualizar():
    print("Actualizacion de datos(contacto)")
    id_ingresado = input("Ingrese su ID number : ")
    for usuario, clave in usuarios.items():
        if clave["id"] == str(id_ingresado):
            nombre = usuario
            print(f"Hola, {nombre} ¿ Que deseas realizar ? ")
            break
    else:
        print("Usuario no registrado")
        return
    print("1.Actualizar contacto")
    print("2.Cambiar Contraseña")
    opcion = input("Ingrese una opcion : ")
    if opcion =='1':
        nuevo_telefono = input("Ingrese su nuevo numero de telefono : ")
        print(f"{nombre}, Cambio exitoso. Tu nuevo telefono es {str(nuevo_telefono)} ")
        
    elif opcion =='2':
        contraseña_actual = input("Ingrese su contraseña actual :")
        for usuario, clave in usuarios.items():
            if clave["contraseña"] == str(contraseña_actual):
                nombre = usuario
                print(f"Hola, {nombre}")
                while True:
                    try:
                        nueva_contraseña = input("Por favor ingrese su nueva contraseña :")
                        if len(str(nueva_contraseña)) != 4 or not str(nueva_contraseña).isdigit():
                            print("La contraseña debe tener 4 digitos numericos.")
                            continue
                        break
                    except ValueError:
                        print("La contraseña debe contener solo números.")
                print(f"{nombre}, Tu nueva contraseña fue modificada exitosamente")
                break
        else:
            print("Contraseña incorrecta")
                    
                
    else:
        print("Opcion no valida")
def salir():
    return
    
    

        
       
# Programa principal
while True:
    menu()
    opcion = input("Ingrese una opción (1-4): ")

    if opcion == '1':
        registro()
    elif opcion == '2':
        ingresar()
    elif opcion == '3':
        actualizar()
    elif opcion == '4':
        salir()
    
    else:
        print("Opcion no valida")

    continuar = input("¿Desea continuar? (s/n): ")
    if continuar.lower() != 's':
        print("Saliendo del programa.")
        break


