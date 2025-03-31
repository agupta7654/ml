from regipy import RegistryHive

# Load the NTUSER.DAT registry hive
hive = RegistryHive("C:/Users/897110/NTUSER.DAT")

# Extract relevant registry data, e.g., desktop settings
desktop_key = hive.get_key("Control Panel/desktop")

# Print the values
for value in desktop_key.values():
    print(value.name, value.value)