export const fetchMeals = async (setMeals) => {
  const response = await fetch(
    'https://www.themealdb.com/api/json/v1/1/filter.php?c=Seafood'
  );
  const data = await response.json();
  console.log(data);

  setMeals(data.meals);
};
