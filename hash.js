const toHash = (str) => {
  let hashValue = 0;
  if (str.length === 0) return hashValue;
  for (let i = 0; i < str.length; i++) {
    const char = str.charCodeAt(i);
    hashValue = (hashValue << 5) - hashValue + char;
    hashValue = hashValue & hashValue;
  }
  return hashValue;
};
